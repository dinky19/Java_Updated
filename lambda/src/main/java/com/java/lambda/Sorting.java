package com.java.lambda;

import java.io.File;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Sorting {

	private static Stream<File> files(File[] files, Predicate<File> p) {
		Stream<File> file = Stream.of(files).filter(p).sorted();
		return file;
	}

	private static Stream<File> directories(File[] files, Predicate<File> p) {
		Stream<File> dir = Stream.of(files).filter(p).sorted();
		return dir;
	}

	public static void main(String[] args) {

		File[] file = { new File("E://XYZ.TXT"), new File("E://QRST"), new File("E://EVS"), new File("E://ABC") };
		Stream<File> dir = directories(file, f -> f.isDirectory());
		Stream<File> fl = files(file, f -> !f.isDirectory());
		Stream<File> sorted = Stream.concat(dir, fl);
		sorted.forEach(System.out::println);
	}
}
