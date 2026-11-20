package com.aquamonitor.platform.u202418405.monitoring.domain.model.commands;

import com.aquamonitor.platform.u202418405.monitoring.domain.model.valueobjects.*;


/**
 * Command to create a sampling plan.
 *
 * @param planCode the plan code
 * @param stationId the monitoring station id
 * @param samplingWindow the sampling date range
 * @param sampleVolume the volume to collect
 * @param priorityLevel priority from 1 to 5
 * @param status the plan status, already defaulted to PENDING when omitted
 * @param samplingNotes optional notes
 * @author Jean Pierre Condor Sandoval
 */
public record CreateSamplingPlanCommand(
        PlanCode planCode,
        StationId stationId,
        SamplingWindow samplingWindow,
        SampleVolume sampleVolume,
        Integer priorityLevel,
        SamplingPlanStatus status,
        String samplingNotes) {
}