package com.example.shamtay.giphytest.dagger.grid;

import com.example.shamtay.giphytest.dagger.FragmentScope;
import com.example.shamtay.giphytest.dagger.GiphyApi;
import com.example.shamtay.giphytest.grid.ImagesGridPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class GridModule {

    @Provides
    @FragmentScope
    ImagesGridPresenter getImagesGridPresenter(GiphyApi api) {
        return new ImagesGridPresenter(api);
    }


}