/**
 * Metaform REST API
 * REST API for Metaform
 *
 * OpenAPI spec version: 0.0.1
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.0-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.MetaformApiClient);
  }
}(this, function(expect, MetaformApiClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new MetaformApiClient.ExportThemeFilesApi();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('ExportThemeFilesApi', function() {
    describe('createExportThemeFile', function() {
      it('should call createExportThemeFile successfully', function(done) {
        //uncomment below and update the code to test createExportThemeFile
        //instance.createExportThemeFile(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('deleteExportThemeFile', function() {
      it('should call deleteExportThemeFile successfully', function(done) {
        //uncomment below and update the code to test deleteExportThemeFile
        //instance.deleteExportThemeFile(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('findExportThemeFile', function() {
      it('should call findExportThemeFile successfully', function(done) {
        //uncomment below and update the code to test findExportThemeFile
        //instance.findExportThemeFile(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listExportThemeFiles', function() {
      it('should call listExportThemeFiles successfully', function(done) {
        //uncomment below and update the code to test listExportThemeFiles
        //instance.listExportThemeFiles(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('updateExportThemeFile', function() {
      it('should call updateExportThemeFile successfully', function(done) {
        //uncomment below and update the code to test updateExportThemeFile
        //instance.updateExportThemeFile(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
