package com.nttdata.controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.clases.Person;

import reactor.core.publisher.Flux;

/**
 * Controlador
 * @author Angel
 *
 */
@RestController
public class PersonListController
{
	@GetMapping("/person-list-1")
	public Flux<Person> personList1()
	{		
		Person p1 = new Person();
		p1.setName("Serena");
		p1.setLastname("Williams");
		p1.setAge(39);
		
		Person p2 = new Person();
		p2.setName("Simone");
		p2.setLastname("Biles");
		p2.setAge(24);
		
		Flux<Person> f = Flux.just(p1, p2).delayElements(Duration.ofSeconds(3));
		f.subscribe(p -> System.out.println(p));
		
		return f;
	}
	
	@GetMapping("/person-list-2")
	public Flux<Person> personList2()
	{		
		Person p1 = new Person();
		p1.setName("Tom");
		p1.setLastname("Cruise");
		p1.setAge(59);
		
		Person p2 = new Person();
		p2.setName("Denzel");
		p2.setLastname("Washington");
		p2.setAge(66);
		
		Flux<Person> f = Flux.just(p1, p2).delayElements(Duration.ofSeconds(3));
		f.subscribe(p -> System.out.println(p));
		
		return f;
	}
	
	@GetMapping("/person-list-3")
	public Flux<Person> personList3()
	{		
		Person p1 = new Person();
		p1.setName("Michael");
		p1.setLastname("Jordan");
		p1.setAge(58);
		
		Person p2 = new Person();
		p2.setName("Lebron");
		p2.setLastname("James");
		p2.setAge(36);
		
		Flux<Person> f = Flux.just(p1, p2).delayElements(Duration.ofSeconds(3));
		f.subscribe(p -> System.out.println(p));
		
		return f;
	}
	
	@GetMapping("/person-list-4")
	public Flux<Person> personList4()
	{		
		Person p1 = new Person();
		p1.setName("Scarlett");
		p1.setLastname("Johansson");
		p1.setAge(36);
		
		Person p2 = new Person();
		p2.setName("Jennifer");
		p2.setLastname("Aniston");
		p2.setAge(52);
		
		Flux<Person> f = Flux.just(p1, p2).delayElements(Duration.ofSeconds(3));
		f.subscribe(p -> System.out.println(p));
		
		return f;
	}
}
