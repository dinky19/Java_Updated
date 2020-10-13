package com.java.collections;

import java.util.Set;
import java.util.TreeSet;

public class MovieDetailsList {
	
	Set<MovieDetails> movies = new TreeSet<MovieDetails>();
	
	public void add_movie( m) {
		movies.add(m);
	}
	public void remove_movie(MovieDetails m) {
		movies.remove(m);
	}
	
	public void remove_AllMovies(MovieDetails m) {
		movies.clear();
	}
	public void find_movie_By_mov_Name(String name) {
		for(MovieDetails m: movies) {
			if(m.getMov_Name().equalsIgnoreCase(name)) {
				System.out.println(m.getMov_Name() + " "  + m.getLead_Actor() +  " " + m.getLead_Actress() + " " + 
			m.getGenre());
			}
		}
	}
	public void find_movie_By_Genre(String genre) {
		for(MovieDetails m: movies) {
			if(m.getGenre().equalsIgnoreCase(genre)) {
				System.out.println(m.getMov_Name() + " "  + m.getLead_Actor() +  " " + m.getLead_Actress() + " " + 
			m.getGenre());
			}
		}
	}
	public void sortMovieBasedOnString(String s) {
		Set<MovieDetails> newMovies = new TreeSet<MovieDetails>();
		if(s.equalsIgnoreCase("Name")) {
			newMovies = new TreeSet<MovieDetails>(new MovieComparator());
		}
		movies.addAll(newMovies);
	}
	public void displayMovieList() {
		for( MovieDetails m : movies) {
			System.out.println(m.getMov_Name() + " " + m.getLead_Actor() + " " + m.getLead_Actress() + m.getGenre());
		}
	}
	
}