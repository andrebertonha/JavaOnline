package br.com.abc.javacore.nio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

//montar maquina virtual com linux para testar esta aula!
//remover imports nao utilizados ctrl - alt - O
public class PosixFileAttributesTest {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/home/andre/dev/arquivo");
        PosixFileAttributes posix = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posix.permissions());
        System.out.println("Alterando as permissoes ");

        Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-rw-rw-");
        Files.setPosixFilePermissions(path,permissions);
        posix = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(posix.permissions());
    }
}
