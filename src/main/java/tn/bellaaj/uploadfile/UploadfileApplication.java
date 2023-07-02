package tn.bellaaj.uploadfile;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tn.bellaaj.uploadfile.service.FilesStorageService;


@SpringBootApplication
public class UploadfileApplication implements CommandLineRunner {

	@Resource
	  FilesStorageService storageService;
	
	public static void main(String[] args) {
		SpringApplication.run(UploadfileApplication.class, args);
	}
	
	  @Override
	  public void run(String... arg) throws Exception {
//	    storageService.deleteAll();
	    storageService.init();
	  }

}
