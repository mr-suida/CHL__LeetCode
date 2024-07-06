
#
# cd folder_files; python3 ren_nam.py
# this script rename all files in directory for fixed size names.
#

import os
import re
import uuid

file_list = os.popen(' ls -p -1 | grep -v /').read().strip().split('\n')

for file in file_list:
    ext_file = file[-4:].lower()
    new_file = str(uuid.uuid4()).split('-')[0] + f'{ext_file}'

    print(f'rename: {file} --> {new_file}')
    os.rename(file,new_file)
