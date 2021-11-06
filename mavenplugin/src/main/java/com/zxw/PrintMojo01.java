package com.zxw;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * @goal printMojoApi
 * @phase compile
 */
public class PrintMojo01 extends AbstractMojo {

    /**
     * @parameter expression="${name}"
     */
    private String name;

    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println(name);
        System.out.println("我是第二个插件");
    }
}
