/*
 * Copyright 2016 dmfs GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.cloudcargo.attachments.sdk.attachments;

import android.content.Context;
import android.support.annotation.NonNull;

import org.cloudcargo.attachments.sdk.Attachment;
import org.cloudcargo.attachments.sdk.AttachmentPreview;
import org.cloudcargo.attachments.sdk.previews.FuturePreview;
import org.cloudcargo.attachments.sdk.previews.FuturePreviewUri;

import java.net.URI;


/**
 * Represents an {@link Attachment} that's given by its URL.
 *
 * @author Marten Gajda
 */
public final class SimpleAttachment implements Attachment
{
    private final URI mUrl;


    /**
     * Creates an {@link Attachment} by its URL.
     *
     * @param url
     *         A {@link URI} object of the attachment URL.
     */
    public SimpleAttachment(@NonNull URI url)
    {
        mUrl = url;
    }


    @NonNull
    @Override
    public URI url()
    {
        return mUrl;
    }


    @NonNull
    @Override
    public AttachmentPreview preview(@NonNull Context context)
    {
        return new FuturePreview(this, new FuturePreviewUri(context, mUrl));
    }

}
