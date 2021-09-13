package kr.co.bonjin.learningapiboard.controller;

import kr.co.bonjin.learningapiboard.exception.ApiError;
import kr.co.bonjin.learningapiboard.exception.ApiException;
import kr.co.bonjin.learningapiboard.response.ApiDataResponse;
import kr.co.bonjin.learningapiboard.response.ApiResponse;
import kr.co.bonjin.learningapiboard.service.BoardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/board")
public class ApiBoardController {

    private BoardService boardService;

    public ApiBoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping
    public ApiResponse getBoardList() {

        // Error Response
//        throw new ApiException(ApiError.MISSING_PARAMETER, "Not Parameters");

        // 정상 Response
        return new ApiDataResponse<>("");
    }
}
