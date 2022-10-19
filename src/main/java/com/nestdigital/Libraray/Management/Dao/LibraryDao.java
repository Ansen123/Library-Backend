package com.nestdigital.Libraray.Management.Dao;

import com.nestdigital.Libraray.Management.Model.LibraryModel;
import org.springframework.data.repository.CrudRepository;

public interface LibraryDao extends CrudRepository<LibraryModel,Integer> {

}
