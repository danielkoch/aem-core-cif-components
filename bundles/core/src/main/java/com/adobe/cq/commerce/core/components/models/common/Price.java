/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2020 Adobe
 ~
 ~ Licensed under the Apache License, Version 2.0 (the "License");
 ~ you may not use this file except in compliance with the License.
 ~ You may obtain a copy of the License at
 ~
 ~     http://www.apache.org/licenses/LICENSE-2.0
 ~
 ~ Unless required by applicable law or agreed to in writing, software
 ~ distributed under the License is distributed on an "AS IS" BASIS,
 ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ~ See the License for the specific language governing permissions and
 ~ limitations under the License.
 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package com.adobe.cq.commerce.core.components.models.common;

/**
 * Asset is a view model interface representing a product asset.
 */
public interface Price {

    /**
     * Indicates if a product price is not available. If a product price is not
     * available, most methods return null or an empty string.
     *
     * @return <code>false</code> if price is available, <code>true</code> if no
     *         price is available.
     */
    boolean isEmpty();

    Boolean isRange();

    Boolean isDiscounted();

    boolean isStartPrice();

    String getCurrency();

    Double getRegularPrice();

    /**
     * Returns formatted regular price.
     *
     * @return formatted price as string, might be empty if no price is available.
     */
    String getFormattedRegularPrice();

    Double getFinalPrice();

    /**
     * Returns formatted final price.
     *
     * @return formatted price as string, might be empty if no price is available.
     */
    String getFormattedFinalPrice();

    Double getDiscountAmount();

    /**
     * Returns formatted discount amount.
     *
     * @return formatted discount amount as string, might be empty if no price is
     *         available.
     */
    String getFormattedDiscountAmount();

    Double getDiscountPercent();

    Double getRegularPriceMax();

    /**
     * Returns formatted maximum regular price.
     *
     * @return formatted price as string, might be empty if no price is available.
     */
    String getFormattedRegularPriceMax();

    Double getFinalPriceMax();

    /**
     * Returns formatted maximum final price.
     *
     * @return formatted price as string, might be empty if no price is available.
     */
    String getFormattedFinalPriceMax();

    Double getDiscountAmountMax();

    /**
     * Returns formatted maximum discount amount.
     *
     * @return formatted discount amount as string, might be empty if no price is
     *         available.
     */
    String getFormattedDiscountAmountMax();

    Double getDiscountPercentMax();
}
