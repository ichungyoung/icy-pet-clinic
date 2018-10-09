package net.futileprogramming.icypetclinic.services;

import net.futileprogramming.icypetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);
	
}
