package com.api.Utlities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestDataUtil {

	
	public static String readJSONFile(String filePath) throws IOException
	{
		return new String(Files.readAllBytes(Paths.get(filePath)));
	}
}
