package com.shownight.night;

import com.shownight.night.models.Stream;
import com.shownight.night.models.Viewer;
import com.shownight.night.repositories.StreamRepository;
import com.shownight.night.repositories.ViewerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class NightApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
			SpringApplication.run(NightApplication.class, args);
		StreamRepository streamRepository =
				configurableApplicationContext.getBean(StreamRepository.class);
		ViewerRepository viewerRepository =
				configurableApplicationContext.getBean(ViewerRepository.class);

		Viewer john = new Viewer(); john.setNickName("John Dickson");
		Viewer adam = new Viewer(); adam.setNickName("Adam Kim");
		Viewer tina = new Viewer(); tina.setNickName("Tina Jena");
		List<Viewer> viewers = Arrays.asList(john, adam, tina);

		Stream cookingStream = new Stream(); cookingStream.setName("Video games");
		Stream gameStream = new Stream(); gameStream.setName("Ghost Recon");
		List<Stream> streams = Arrays.asList(cookingStream, gameStream);
		streamRepository.saveAll(streams);

		john.setFollowedStreams(gameStream);
		adam.setFollowedStreams(cookingStream);
		tina.setFollowedStreams(cookingStream);

		viewerRepository.saveAll(viewers);









	}

}
