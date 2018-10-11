package net.futileprogramming.icypetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import net.futileprogramming.icypetclinic.model.Owner;
import net.futileprogramming.icypetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long>
	implements OwnerService {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	@Override
	public Owner save(Owner t) {
		return super.save(t.getId(), t);
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public void delete(Owner t) {
		super.delete(t);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}
}
