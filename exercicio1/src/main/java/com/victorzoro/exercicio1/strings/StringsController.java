package com.victorzoro.exercicio1.strings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api")
public class StringsController {
  private StringsService stringsService;

  @Autowired
  public StringsController(StringsService stringsService) {
    this.stringsService = stringsService;
  }

  @GetMapping("/strings")
  public List<IndexedStringsDto> getStrings() {
    return this.stringsService.getStrings();
  }

  @PostMapping("/strings")
  public void addString(@RequestParam("string") String string) {
    this.stringsService.addString(string);
  }

  @DeleteMapping("/strings/{stringId}")
  public void deleteString(@PathVariable("stringId") int stringId) {
    this.stringsService.deleteString(stringId);
  }
}
