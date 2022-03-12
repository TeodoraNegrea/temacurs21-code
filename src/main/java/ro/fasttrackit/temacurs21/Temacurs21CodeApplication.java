package ro.fasttrackit.temacurs21;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.temacurs21.entity.*;
import ro.fasttrackit.temacurs21.repository.*;

import java.util.List;

@SpringBootApplication
public class Temacurs21CodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Temacurs21CodeApplication.class, args);
	}

	@Bean
	CommandLineRunner atStartup(MovieRepository repository,
								MovieRatingRepository movieRatingRepository,
								ActorRepository actorRepository,
								ReviewRepository reviewRepository,
								StudioRepository studioRepository){


		return args -> {

			MovieRating rating1 = movieRatingRepository.save(new MovieRating(7,"Romania  Film"));
			MovieRating rating2 = movieRatingRepository.save(new MovieRating(9,"20th Century Fox"));
			MovieRating rating3 = movieRatingRepository.save(new MovieRating(8,"Medusa Film"));
			MovieRating rating4 = movieRatingRepository.save(new MovieRating(8,"Paramount Pictures"));
			MovieRating rating5 = movieRatingRepository.save(new MovieRating(7,"Carousel Productions"));
			Actor actor1 = actorRepository.save(new Actor("Amza Pellea",1931));
			Actor actor2 = actorRepository.save(new Actor("Leonardo DiCaprio",1974));
			Actor actor3 = actorRepository.save(new Actor("Tim Roth",1961));
			Actor actor4 = actorRepository.save(new Actor("James Jim Carrey",1962));
			Actor actor5 = actorRepository.save(new Actor("Steve Carell",1962));
			Review review1 = reviewRepository.save(new Review("cocteil amuzant","Alice Manoiu"));
			Review review2 = reviewRepository.save(new Review("film of teh tragic voyage","Roger Ebert"));
			Review review3 = reviewRepository.save(new Review("drama","Roger Ebert"));
			Review review4 = reviewRepository.save(new Review("comedy and drama","Roger Ebert"));
			Review review5 = reviewRepository.save(new Review("a sweet romantic comedy","Roger Ebert"));
			Studio studio1 = studioRepository.save(new Studio("Casa de Filme 4","Strada Dobrescu 4, Sector 1, Bucuresti"));
			Studio studio2 = studioRepository.save(new Studio("20th Century Fox","10201 W. Pico Blvd"));
			Studio studio3 = studioRepository.save(new Studio("Medusa Film","Viale Aventino 26, Roma"));
			Studio studio4 = studioRepository.save(new Studio("Scott Rudin Productions","120 W. 45rh St."));
			Studio studio5 = studioRepository.save(new Studio("Warner Bros. Pictures"," 3400 Warner Blvd."));


			repository.saveAll(List.of(
					new Movie("Nea Marin Miliardar",1971),
					new Movie("Titanic",1997),
					new Movie("Legenda pianistului de pe ocean",1998),
					new Movie("The Truman Show",1998),
					new Movie("Crazy Stupid Love",2011)
			));

		};
	}

}
