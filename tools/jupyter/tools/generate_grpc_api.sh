#!/bin/bash
# by Andrea Ambrosini Rossonet s.c.a r.l.
#
mkdir -p ~/work/grpc-apis
OUTPUT=~/work/grpc-apis
for target_name in ability channel nlu channel-grpc base
do
  echo "working on ptalk-${target_name}-api"
  target=$OUTPUT/${target_name}
  mkdir -p $target
  python -m grpc_tools.protoc --python_out=${target} -I ~/${target_name} --grpc_python_out=${target} ~/${target_name}/ptalk-${target_name}-api.proto
done
