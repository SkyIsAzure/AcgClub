package com.rabtman.acgclub.mvp.contract;

import com.rabtman.acgclub.mvp.model.jsoup.APicDetail;
import com.rabtman.common.base.mvp.IModel;
import com.rabtman.common.base.mvp.IView;
import io.reactivex.Flowable;
import java.io.File;

/**
 * @author Rabtman
 */
public interface APicDetailContract {

  interface View extends IView {

    void showAPictures(APicDetail aPicDetail);

    void savePictureSuccess(File imgFile);
  }

  interface Model extends IModel {

    Flowable<APicDetail> getAPicDetail(String url);

  }
}
