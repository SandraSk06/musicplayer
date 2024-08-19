package com.explore.musicplayer.domain.usecase;

import com.explore.musicplayer.domain.repository.IAudioRepository;

public class GetArtistUseCase {

    private IAudioRepository iAudioRepository;

    public String invoke() {
        return iAudioRepository.getMetadata().artistName;
    }
}
