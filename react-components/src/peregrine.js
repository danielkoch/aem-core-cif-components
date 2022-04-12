/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 ~ Copyright 2022 Adobe
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
export { default as ConfigContextProvider, useConfigContext } from './context/ConfigContext';
export { useAwaitQuery, useStorefrontEvents, usePageType } from './utils/hooks';
export { createProductPageUrl } from './utils/createProductPageUrl';

export { default as useCustomUrlEvent } from './utils/useCustomUrlEvent';
export { default as useReferrerEvent } from './utils/useReferrerEvent';
export { default as usePageEvent } from './utils/usePageEvent';
export { default as useDataLayerEvents } from './utils/useDataLayerEvents';
export { default as compressQueryFetch } from './utils/compressQueryFetch';

// new since CIF-1440
export { useAddToCart, useAddToCartEvent } from './talons/Cart';

// new since CIF-2539
export { useAddToWishlistEvent } from './talons/Wishlist';
