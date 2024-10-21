package com.example.demo.service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.example.demo.entities.Animal;
import com.example.demo.repository.AnimalRepository;

	@Service
	public class AnimalService {
		private final AnimalRepository animalrepository;
		@Autowired
		public AnimalService(AnimalRepository animalrepository) {
			this.animalrepository = animalrepository;
		}
		public Animal saveAnimal(Animal animal) {
			return animalrepository.save(animal);
		}
		public Animal getAnimalById(Long id) {
			return animalrepository.findById(id).orElse(null);
		}
		public List<Animal>getAllAnimal(){
			return animalrepository.findAll();	
		}
		public void deleteAnimal(Long id) {
			animalrepository.deleteById(id);
		}
	}
