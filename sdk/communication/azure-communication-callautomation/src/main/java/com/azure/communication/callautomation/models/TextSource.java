// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The FileSource model. */
@Fluent
public final class TextSource extends PlaySource {
    /*
     * Text for the cognitive service to be played
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * Source language locale to be played
     */
    @JsonProperty(value = "sourceLocale")
    private String sourceLocale;

    /*
     * Target language locale to be played
     */
    @JsonProperty(value = "targetLocale")
    private String targetLocale;

    /*
     * Voice gender type
     */
    @JsonProperty(value = "voiceGender")
    private GenderType voiceGender;

    /*
     * Voice name to be played
     */
    @JsonProperty(value = "voiceName")
    private String voiceName;

    /**
     * Get the text property: Text for the cognitive service to be played.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: Text for the cognitive service to be played.
     *
     * @param text the text value to set.
     * @return the TextSource object itself.
     */
    public TextSource setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the sourceLocale property: Source language locale to be played.
     *
     * @return the sourceLocale value.
     */
    public String getSourceLocale() {
        return this.sourceLocale;
    }

    /**
     * Set the sourceLocale property: Source language locale to be played.
     *
     * @param sourceLocale the sourceLocale value to set.
     * @return the TextSource object itself.
     */
    public TextSource setSourceLocale(String sourceLocale) {
        this.sourceLocale = sourceLocale;
        return this;
    }

    /**
     * Get the targetLocale property: Target language locale to be played.
     *
     * @return the targetLocale value.
     */
    public String getTargetLocale() {
        return this.targetLocale;
    }

    /**
     * Set the targetLocale property: Target language locale to be played.
     *
     * @param targetLocale the targetLocale value to set.
     * @return the TextSource object itself.
     */
    public TextSource setTargetLocale(String targetLocale) {
        this.targetLocale = targetLocale;
        return this;
    }

    /**
     * Get the voiceGender property: Voice gender type.
     *
     * @return the voiceGender value.
     */
    public GenderType getVoiceGender() {
        return this.voiceGender;
    }

    /**
     * Set the voiceGender property: Voice gender type.
     *
     * @param voiceGender the voiceGender value to set.
     * @return the TextSource object itself.
     */
    public TextSource setVoiceGender(GenderType voiceGender) {
        this.voiceGender = voiceGender;
        return this;
    }

    /**
     * Get the voiceName property: Voice name to be played.
     *
     * @return the voiceName value.
     */
    public String getVoiceName() {
        return this.voiceName;
    }

    /**
     * Set the voiceName property: Voice name to be played.
     *
     * @param voiceName the voiceName value to set.
     * @return the TextSourceInternal object itself.
     */
    public TextSource setVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }
}
