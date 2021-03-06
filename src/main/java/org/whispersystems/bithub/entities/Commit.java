/**
 * Copyright (C) 2013 Open WhisperSystems
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.whispersystems.bithub.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Commit {

  @JsonProperty
  private String  id;

  @JsonProperty
  private String  message;

  @JsonProperty
  @NotNull
  private Author  author;

  @JsonProperty
  private String  url;

  @JsonProperty
  private boolean distinct;

  public String getSha() {
    return id;
  }

  public String getMessage() {
    return message;
  }

  public Author getAuthor() {
    return author;
  }

  public String getUrl() {
    return url;
  }

  public boolean isDistinct() {
    return distinct;
  }
}
