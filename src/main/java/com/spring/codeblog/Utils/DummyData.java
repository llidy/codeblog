package com.spring.codeblog.Utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.CodeBlogRepository;


@Component
public class DummyData {
	
	@Autowired
	CodeBlogRepository codeBlogRepository;
	
	
	//@PostConstruct
	public void savePosts() {
		
		List<Post> postList = new ArrayList<>();
		
		Post post1 = new Post();
		post1.setAutor("Michelli Brito");
		post1.setData(LocalDate.now());
		post1.setTitulo("Docker");
		post1.setTexto("Mussum Ipsum, cacilds vidis litro abertis. Mé faiz elementum girarzis, nisi eros vermeio. In elementis mé pra quem é amistosis quis leo. Mauris nec dolor in eros commodo tempor. Aenean aliquam molestie leo, vitae iaculis nisl. Per aumento de cachacis, eu reclamis.\r\n"
				+ "\r\n"
				+ "Detraxit consequat et quo num tendi nada. Casamentiss faiz malandris se pirulitá. Delegadis gente finis, bibendum egestas augue arcu ut est. Nec orci ornare consequat. Praesent lacinia ultrices consectetur. Sed non ipsum felis.");
	
		Post post2 = new Post();
		post2.setAutor("Lidiane");
		post2.setData(LocalDate.now());
		post2.setTitulo("API");
		post2.setTexto("Mussum Ipsum, cacilds vidis litro abertis. Mé faiz elementum girarzis, nisi eros vermeio. In elementis mé pra quem é amistosis quis leo. Mauris nec dolor in eros commodo tempor. Aenean aliquam molestie leo, vitae iaculis nisl. Per aumento de cachacis, eu reclamis.\r\n"
				+ "\r\n"
				+ "Detraxit consequat et quo num tendi nada. Casamentiss faiz malandris se pirulitá. Delegadis gente finis, bibendum egestas augue arcu ut est. Nec orci ornare consequat. Praesent lacinia ultrices consectetur. Sed non ipsum felis.");
	
		postList.add(post1);
		postList.add(post2);
		
		for(Post post: postList) {
			Post postSaved = codeBlogRepository.save(post);
			System.out.println(postSaved.getId());
		}
	
	
	}
	

}
