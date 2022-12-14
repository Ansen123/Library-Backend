package com.nestdigital.Libraray.Management.Controller;

import com.nestdigital.Libraray.Management.Dao.LibraryDao;
import com.nestdigital.Libraray.Management.Model.LibraryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    private LibraryDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addLibrary",consumes = "application/json",produces = "application/json")
    public String library(@RequestBody LibraryModel library){
    dao.save(library);
    return "{status:Success'}";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<LibraryModel>viewlibrary() {
        return (List<LibraryModel>) dao.findAll();

    }
        @CrossOrigin(origins = "*")
        @PostMapping("/delete")
        @Transactional
        public String deletebook(@RequestBody LibraryModel library){
        dao.deleteBookById(library.getId());
        return "{status:Success}";

        }
@CrossOrigin(origins = "*")
    @PostMapping(path = "/searchBook",consumes = "application/json",produces = "application/json")
    public List<LibraryModel>searchBook(@RequestBody LibraryModel libray){
        return (List<LibraryModel>) dao.searchBook(libray.getBookName());
}
@CrossOrigin(origins = "*")
@Transactional
    @PostMapping(path = "/editBook", consumes = "application/json",produces = "application/json")
    public String editBook(@RequestBody LibraryModel library){
        dao.editBook(library.getBookName(),library.getAuthorName(),library.getPublishYear(),library.getId());
        return "{status:'Success'}";
}


}
