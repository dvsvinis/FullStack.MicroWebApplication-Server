import { TestBed } from '@angular/core/testing';

import { CommentServicesService } from '../../../../../../angularclient/src/app/services/comment-services.service';

describe('CommentServicesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CommentServicesService = TestBed.get(CommentServicesService);
    expect(service).toBeTruthy();
  });
});
