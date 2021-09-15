package com.example.ecobesa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class EcobesaApplication implements CommandLineRunner{
	
	

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(EcobesaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*uploadFileService.deleteAll();*/
		/*uploadFileService.init();*/
		
		String password="123456";
		for(int i=0;i<2;i++) {
			String bcryptPassword = passwordEncoder.encode(password);
			System.out.println(bcryptPassword);
		}
		
		 
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy/MM/dd");
        
        Date fecha_ini = format1.parse("2021/05/01");
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha_ini); 
        calendar.add(Calendar.DAY_OF_YEAR, 180);
        System.out.println(calendar.getTime());
		
	}
	
	
}
