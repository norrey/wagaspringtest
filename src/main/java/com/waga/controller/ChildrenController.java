package com.waga.controller;

import com.waga.model.ChildInfo;
import com.waga.service.api.ChildrenServiceApi;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Norrey Okumu <okumu.norrey@gmail.com>
 * @since Mar 15, 2018, 11:14:33 PM
 */
@RestController
public class ChildrenController {

    private final ChildrenServiceApi childrenServiceApi;

    public ChildrenController(final ChildrenServiceApi childrenServiceApi) {
        this.childrenServiceApi = childrenServiceApi;
    }

    @GetMapping(value = "/children/{child_id}/info")
    public ResponseEntity<ChildInfo> fetchChildInfo(@PathVariable("child_id") final Long childId) {
        final Optional<ChildInfo> childInfo = childrenServiceApi.fetchChildInfo(childId);
        if (!childInfo.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(childInfo.get(), HttpStatus.OK);
    }

    @GetMapping(value = "/children/{child_id}/color")
    public ResponseEntity<Map<String, String>> fetchChildColor(@PathVariable("child_id") final Long childId) {
        Optional<String> color = childrenServiceApi.fetchChildColor(childId);
        if (!color.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        final Map<String, String> colorResponse = new HashMap<>();
        colorResponse.put("color", color.get());
        return new ResponseEntity<>(colorResponse, HttpStatus.OK);
    }

}
