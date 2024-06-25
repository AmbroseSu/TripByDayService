package com.ambrose.service.dto;

import com.ambrose.repository.entities.PackageInDay;
import com.ambrose.repository.entities.PackageInDestination;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PackageDTO {
  private Long id;

  private String name;
  private String description;
  private Boolean status;
  private String shortDescription;
  private Long startTime;
  private Long endTime;

  private List<Long> packageInDayIds;

  private List<Long> destinationIds;
}
