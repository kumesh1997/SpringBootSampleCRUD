package service;

import domain.movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.movieRepository;

import java.util.List;

@Service
public class serviceClass {

    private movieRepository repo;

    @Autowired
    public List<movie> listall(){
        return repo.findAll();
    }

    public void save(movie m){
        repo.save(m);
    }

    public movie get(int id){
        return repo.findById(id).get();
    }

    public void delete(int id){
         repo.deleteById(id);
    }
}
