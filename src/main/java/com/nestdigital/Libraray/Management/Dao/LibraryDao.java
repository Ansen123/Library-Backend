package com.nestdigital.Libraray.Management.Dao;

import com.nestdigital.Libraray.Management.Model.LibraryModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibraryDao extends CrudRepository<LibraryModel,Integer> {
@Modifying
    @Query(value = "DELETE FROM `library` WHERE `id`= :id",nativeQuery = true)
    void deleteBookById(Integer id);
@Query(value = "SELECT `id`, `author_name`, `book_name`, `publish_year` FROM `library` WHERE book_name =:book_name",nativeQuery = true)
    List<LibraryModel>searchBook(String book_name);

    @Modifying
    @Query(value = "UPDATE `library` SET `author_name`= :author_name,`book_name`= :book_name,`publish_year`=:publish_year WHERE `id`=:id", nativeQuery = true)
    void editBook(String author_name,String book_name, Integer publish_year,Integer id);

}
