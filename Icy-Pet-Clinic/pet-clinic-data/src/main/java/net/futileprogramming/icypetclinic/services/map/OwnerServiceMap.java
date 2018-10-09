package net.futileprogramming.icypetclinic.services.map;

import java.util.Set;

import net.futileprogramming.icypetclinic.model.Owner;
import net.futileprogramming.icypetclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long>
	implements CrudService<Owner, Long>{

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
}
