package com.Mukusha.blog.repo;

import com.Mukusha.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}
