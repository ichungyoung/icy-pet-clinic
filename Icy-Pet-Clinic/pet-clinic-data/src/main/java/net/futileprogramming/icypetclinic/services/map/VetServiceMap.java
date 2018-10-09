package net.futileprogramming.icypetclinic.services.map;

import java.util.Set;

import net.futileprogramming.icypetclinic.model.Vet;
import net.futileprogramming.icypetclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	@Override
	public Vet save(Vet t) {
		return super.save(t.getId(), t);
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}
	
	@Override
	public void delete(Vet t) {
		super.delete(t);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
