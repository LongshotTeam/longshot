package com.example.longshot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;


import com.example.longshot.endeca.search.dto.SearchServiceDTO;
import com.example.longshot.model.reqest.ReqQuery;
import com.example.longshot.model.reqest.SearchQuery;
import com.example.longshot.model.response.AddQueryReponse;
import com.example.longshot.model.response.CasesResponse;

@RequestMapping("/longshot/api")
@RestController
public interface Longshot {
	
	@CrossOrigin
    @GetMapping("/rank")
    public String rank();

    @PostMapping("/relavanceRank")
    public String publish(@RequestParam String message);

    @PostMapping("/tuneRelevance")
    public ResponseBody tuneRelevance();

    @PostMapping("/importRatings")
    public ResponseBody importRatings();

    @PostMapping("/takeSnapshot")
    public ResponseBody takeSnapshot();

    @GetMapping("/customScorers")
    public ResponseBody selectCustomScorers();

    @PutMapping("/updateSettings")
    public ResponseBody updateSettings();

    @GetMapping("/dropdown/cases")
    public CasesResponse casess();

    @PostMapping("/cases/queries")
    public AddQueryReponse addQuery(@RequestBody ReqQuery query);
   
    @CrossOrigin
    @PostMapping("/browse/search")
    public SearchServiceDTO searchQuery(@RequestBody SearchQuery query);
    
    @CrossOrigin
    @PostMapping("/v1/browse/search")
    public SearchServiceDTO searchQueryDemo(@RequestBody SearchQuery query);

}
