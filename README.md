# Glacier CLI

A command line client to [Amazon Glacier](http://aws.amazon.com/glacier) based on AWS examples.

## Configuration

Create `$HOME/AwsCredentials.properties` with your AWS keys

```
secretKey=…
accessKey=…

```

## Commands

* `upload vault_name file1 file2 …`
* `download vault_name archiveId output_file`
* `delete vault_name archiveId`
* `inventory vault_name`

## Command line options

```
 -output <file_name>   File to save the inventory to. Defaults to 'glacier.json'
 -queue <queue_name>   SQS queue to use for inventory retrieval. Defaults to 'glacier'
 -region <region>      Specify URL as the web service URL to use. Defaults to 'us-east-1'
 -topic <topic_name>   SNS topic to use for inventory retrieval. Defaults to 'glacier'
```

## Examples

Upload file1 and file2 to vault `pictures`

`java -jar glacier-1.0-jar-with-dependencies.jar upload pictures file1 file2`

Download archive with id xxx from vault `pictures` to file `pic.tar` (takes >4 hours)

`java -jar glacier-1.0-jar-with-dependencies.jar download pictures xxx pic.tar`

Delete archive with id xxx from vault `pictures`

`java -jar glacier-1.0-jar-with-dependencies.jar delete pictures xxx`

Get the inventory for vault `pictures` (takes >4 hours)

`java -jar glacier-1.0-jar-with-dependencies.jar inventory pictures`

Upload file1 and file2 to vault `pictures` in Europe region

`java -jar glacier-1.0-jar-with-dependencies.jar -region eu-west-1 upload pictures file1 file2`



## Building

`mvn clean package`

## More info

Uses Glacier high level API for uploading, downloading, deleting files, and the low-level one for retrieving vault inventory.

More info at the [AWS Glacier development docs](http://docs.amazonwebservices.com/amazonglacier/latest/dev/).

License
-------
```
  Copyright 2012 Carlos Sanchez

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
```

