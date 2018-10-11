package net.futileprogramming.icypetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import net.futileprogramming.icypetclinic.model.Vet;
import net.futileprogramming.icypetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

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
