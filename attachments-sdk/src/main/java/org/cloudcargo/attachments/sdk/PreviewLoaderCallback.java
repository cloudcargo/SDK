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

package org.cloudcargo.attachments.sdk;

import android.support.annotation.NonNull;


/**
 * Interface of a handler that's called after loading a preview.
 *
 * @author Marten Gajda
 */
public interface PreviewLoaderCallback
{

    /**
     * Called when the preview has been loaded.
     *
     * @param previewResult
     *         A {@link PreviewResult}.
     */
    void onPreview(@NonNull PreviewResult previewResult);
}