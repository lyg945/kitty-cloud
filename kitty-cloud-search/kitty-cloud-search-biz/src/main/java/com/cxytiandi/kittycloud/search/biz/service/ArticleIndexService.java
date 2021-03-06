package com.cxytiandi.kittycloud.search.biz.service;

import com.cxytiandi.kittycloud.search.biz.param.ArticleIndexSaveParam;

/**
 * @作者 尹吉欢
 * @个人微信 jihuan900
 * @微信公众号 猿天地
 * @GitHub https://github.com/yinjihuan
 * @作者介绍 http://cxytiandi.com/about
 * @时间 2020-03-10 20:54
 */
public interface ArticleIndexService {

    /**
     * 保存文章索引
     * @param param
     * @return
     */
    Boolean saveArticleIndex(ArticleIndexSaveParam param);

}
