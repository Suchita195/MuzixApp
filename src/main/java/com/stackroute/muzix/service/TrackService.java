package com.stackroute.muzix.service;

import com.stackroute.muzix.domain.Track;
import com.stackroute.muzix.exceptions.TrackAlreadyExistsException;
import com.stackroute.muzix.exceptions.TrackNotFoundException;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TrackService {
  //method to save track
  public Track saveTrack(Track track) throws TrackAlreadyExistsException;
  //method to update track
  public Track updateTrack(Track track);
  //method to get all tracks
  public List<Track> getAllTracks();
  //method to delete track
  public void deleteTrack(int id);
  //method to get track by id
  public Track getTrackById(int id) throws TrackNotFoundException;
  //method to get track by name
  public Track getTrackByName(String name);
  //To fetch data from last fm
  public void getTopTrack();
}
