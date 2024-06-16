package sab.dcdemo.org.repository;

import org.springframework.data.repository.ListCrudRepository;

import sab.dcdemo.org.model.Post;


public interface PostRepository extends ListCrudRepository<Post,Integer> {
}
