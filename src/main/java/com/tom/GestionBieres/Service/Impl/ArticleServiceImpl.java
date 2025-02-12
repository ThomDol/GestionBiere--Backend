package com.tom.GestionBieres.Service.Impl;

import com.tom.GestionBieres.Mapper.ArticleMapper;
import com.tom.GestionBieres.Service.ArticleService;
import com.tom.GestionBieres.entity.Article;
import com.tom.GestionBieres.entity.Marque;
import com.tom.GestionBieres.entityDto.ArticleDto;
import com.tom.GestionBieres.exception.MarqueNotFoundException;
import com.tom.GestionBieres.repository.ArticleRepository;
import com.tom.GestionBieres.repository.MarqueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;
    private MarqueRepository marqueRepository;

    @Override
    public List<ArticleDto> findAll() {
        List <Article> articles = this.articleRepository.findAll();
        return articles.stream().map(ArticleMapper::mapToArticleDto).toList();
    }

    public ArticleDto loadByNameAndVolume(String name,int volume){
       return ArticleMapper.mapToArticleDto(this.articleRepository.findByNomArticleAndVolume(name,volume));
    }

    public List<ArticleDto> getAllArticleByMarque (Long idMarque){
        Marque marque = this.marqueRepository.findById(idMarque).orElseThrow(()->new MarqueNotFoundException("Marque non existante"));
        List<Article> articles = this.articleRepository.findAllArticleByMarque(marque);
        return articles.stream().map(ArticleMapper::mapToArticleDto).toList();
    }


}
