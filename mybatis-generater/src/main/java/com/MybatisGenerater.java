package com;

import java.util.ArrayList;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MybatisGenerater {
	public static void main(String[] args) throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		boolean overwrite = true;
		String genCfg = "/configuration.xml";
		ConfigurationParser cp = new ConfigurationParser(list);
		Configuration configuration = cp.parseConfiguration(MybatisGenerater.class.getResourceAsStream(genCfg));
		DefaultShellCallback shellCallback = new DefaultShellCallback(overwrite);
		MyBatisGenerator generator = new MyBatisGenerator(configuration, shellCallback, list);
		generator.generate(null);
	}
}
