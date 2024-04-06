const HttpStatus = {
    OK: { code: 200, status: 'OK' },
    CREATED: { code: 201, status: 'CREATED' },
    NO_CONTENT: { code: 204, status: 'NO CONTENT' },
    BAD_REQUEST: { code: 400, status: 'BAD REQUEST' },
    NOT_FOUND: { code: 404, status: 'NOT FOUND' },
    INTERNAL_SERVER_ERROR: { code: 500, status: 'INTERNAL SERVER ERROR' }
}


class Response {
    constructor(statusCode, httpStatus, message, data) {
        this.statusCode = statusCode;
        this.httpStatus = httpStatus;
        this.message = message;
        this.data = data;
    }
}

export { Response, HttpStatus }