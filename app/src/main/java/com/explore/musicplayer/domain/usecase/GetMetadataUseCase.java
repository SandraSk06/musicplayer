package com.explore.musicplayer.domain.usecase;

import com.explore.musicplayer.domain.model.Metadata;
import com.explore.musicplayer.domain.repository.IAudioRepository;

public class GetMetadataUseCase {

    private IAudioRepository iAudioRepository;

    public Metadata invoke() {
        return iAudioRepository.getMetadata();
    }
}
