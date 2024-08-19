package com.explore.musicplayer.domain.repository;

import com.explore.musicplayer.domain.model.Metadata;

public interface IAudioRepository {
    public Metadata getMetadata();
}
