package com.juno.utils.analyse.web;

import com.juno.utils.analyse.sql.convert.SqlConverter;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author juno
 * @date 2024-02-06 14:47
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/convert")
@Tag(description = "convert", name = "sql转换")
@SecurityRequirement(name = HttpHeaders.AUTHORIZATION)
public class SqlConvertController {

    @GetMapping("/{source}-{target}")
    public void dmCreateSqlToMysql(@PathVariable("source") String source, @PathVariable("target") String target, @RequestParam("file") MultipartFile file, HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename=mysql.sql");
        String sourceSql = new String(file.getBytes(), StandardCharsets.UTF_8);
        String targetSql = SqlConverter.convert((source + "-" + target).toLowerCase(), sourceSql);
        response.getOutputStream().write(targetSql.getBytes(StandardCharsets.UTF_8));
    }

}
