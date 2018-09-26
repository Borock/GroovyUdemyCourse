package com.wojtek.rest.http

import sun.font.CreatedFontTracker

// HTTP METHODS
// GET       /posts      - GETS all the posts in the repository
// GET       /posts/1    - GETS the post that has an id of 1
// POST      /posts      - creates a new post
// PUT       /posts/1    - updates an existing post
// DELETE    /posts/1    - deletes an existsing post

/**
 HTTP Status Codes
 1xx - description
 2xx - success
       200 - OK
       201 - Created
       204 - No Content
 3xx - redirection
       301 - Moved permanently
       304 - Not modified
       307 - Temporary redirect
 4xx - client error
        400 - Bad request (bad syntax for example)
        401 - Unauthorized - before the authentication was provided
        403 - Forbidden - authentication was provided, but still no access rights
        404 - Not found - resource was not found
 5xx - server error
        500 - Internal server error
        502 - Bad Gateway


 Content Negotiation




 **/