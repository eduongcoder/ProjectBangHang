import React from 'react';
import styled from 'styled-components';
import { Autocomplete, AutocompleteSection, AutocompleteItem } from '@nextui-org/react';
const Container = styled.div`
  position: relative;
  width: 250px;
  height: 16px;
  backdrop-filter: blur(20px);
  border-radius: 20px;
  padding-top: 20px; /* Add padding to push the content down */
`;

const Label = styled.label`
  position: absolute;
  top: 0;
  left: 10px; /* Adjust as needed */
  margin-bottom: 5px; /* Add margin to separate from placeholder */
  background-color: white; /* To avoid overlap */
  padding: 0 5px; /* Padding to make space for label */
`;

export default function App({ value, setValue, content, data }) {
    console.log(value)
  const handleSelectionChange = (e) => {
    console.log(e)
    setValue(e);
  };

  return (
    <Container className="mb-0">
      <Label id="autocomplete-label">{content}</Label>
      <Autocomplete
        aria-labelledby="autocomplete-label"
        value={value}
        onInputChange={handleSelectionChange}
        placeholder={`Search a ${content}`}
        className="w-[200px] h-fit backdrop-blur-lg rounded-lg border-[2px] border-slate-400"
      >
        <AutocompleteSection showDivider title={content} className="pb-2 backdrop-blur-xl rounded-2xl">
          {data.map((el, index) => (
            <AutocompleteItem key={index}>{el}</AutocompleteItem>
          ))}
        </AutocompleteSection>
      </Autocomplete>
    </Container>
  );
}
