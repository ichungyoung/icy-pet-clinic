package net.futileprogramming.icypetclinic.services.map;

import java.util.Set;

import net.futileprogramming.icypetclinic.model.Pet;
import net.futileprogramming.icypetclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Pet save(Pet t) {
		return super.save(t.getId(), t);
	}
	
	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
	@Override
	public void delete(Pet t) {
		super.delete(t);
	}

}
